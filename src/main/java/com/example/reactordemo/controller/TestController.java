package com.example.reactordemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("demo")
public class TestController {
	
	@RequestMapping("mono-hello")
	public Mono<String> sayMonoHello(@RequestParam  String name ) {
		return Mono.just("Hello, "+name);
	}

	@RequestMapping("flux-hello")
	public Flux<String> sayFluxHello() {
		return Flux.just("Hello"," ", "World !");
	}

	@RequestMapping("mono-empty")
	public Mono<String> sayMonoEmptyHello() {
		return Mono.empty();
	}

	@RequestMapping("mono-never")
	public Mono<String> sayMonoNever() {
		return Mono.never();
	}

}
