package com.mumsched;
/*package com.example.config;



import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
//@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web
            .ignoring()
			.antMatchers("/**.html", //
                         "/css/**", //
                         "/js/**", //
                         "/i18n/**",// 
                         "/libs/**",//
                         "/img/**", //
                         "/webjars/**",//
                         "/ico/**");
	}

	   @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	        
		        .antMatchers("/dashboard/**").hasRole("USER")
		        .antMatchers("/api/**").hasRole("USER")
		        .antMatchers("/login").permitAll()
		        .antMatchers("/").permitAll()
		        .and() 
		        .formLogin().loginPage("/login").and() 
		        .logout().logoutUrl("/logout").logoutSuccessUrl("/login").clearAuthentication(true).deleteCookies("remove").invalidateHttpSession(true).and()
	            .httpBasic().and()
				.csrf().disable();
	    }
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication()
                    .passwordEncoder(passwordEncoder())
                    .withUser("admin").password("admin").authorities("ROLE_ADMIN")
                    .and()
                        .withUser("user").password("user").authorities("ROLE_USER");
	}


	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}

	@Bean
	public PlaintextPasswordEncoder passwordEncoder() {
		return new PlaintextPasswordEncoder();
	}

}
*/