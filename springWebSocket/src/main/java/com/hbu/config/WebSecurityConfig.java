package com.hbu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by chenwei on 2018/1/29.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/","/login").permitAll()//根路径和/login路径不拦截
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")//登录页面路径为/login
                .defaultSuccessUrl("/chat") //3登陆成功转向chat页面
                .permitAll()
                .and()
                .logout()
                .permitAll();

    }
    //在内存中配置两个用户，密码和用户名一致，角色是USER
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth
                .inMemoryAuthentication()
                .withUser("chen").password("123456").roles("USER")
                .and()
                .withUser("guo").password("123456").roles("USER");
    }
    //5忽略静态资源的拦截
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**");
    }


}
