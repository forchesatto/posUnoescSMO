package com.example.demo;

import org.springframework.stereotype.Service;

@Service("pr")
public class CalculadoraImpostoPR  implements CalculadoraImposto{

	@Override
	public Double getTaxa() {
		return 12.0;
	}
}
