package com.juandmercadolopez.meli.mutants.lib.controller;

import com.juandmercadolopez.meli.mutants.lib.exception.DnaException;
import com.juandmercadolopez.meli.mutants.lib.service.MutantService;

public class Mutant {

  public static boolean isMutant(String[] dna) throws DnaException {

    return MutantService.isMutant(dna);

  }
}
