package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CalculadoraImpostoSC implements CalculadoraImposto {

	@Override
	public Double getTaxa() {
		return 10.0;
	}
}
