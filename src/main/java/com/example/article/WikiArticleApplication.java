package com.example.article;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.article.entities.Article;
import com.example.article.repository.ArticleRepository;



@SpringBootApplication
public class WikiArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikiArticleApplication.class, args);
	}
	
	@Bean public CommandLineRunner commandLineRunner(ArticleRepository
			  articleRepository) {
				  Article a1 = new Article("fleures","hamza");
				  Article a2 = new Article("lions","Olfa");
				  Article a3 = new Article("la mere","hamza");
				  
				  
				  return args ->{ 
					  articleRepository.save(a1);
					  articleRepository.save(a2);
					  articleRepository.save(a3);
					  
					  articleRepository.findAll().forEach(a->{
						  System.out.println(a.getTitle());

					  });
			  
			  }; }

}
