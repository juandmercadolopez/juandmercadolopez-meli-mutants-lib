package com.juandmercadolopez.meli.mutants.lib.util;

import com.juandmercadolopez.meli.mutants.lib.constant.AppConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

  public static boolean validateDnaRowSequenceCharacters(String dnaRowSequence) {
    Pattern p = Pattern.compile(AppConstant.REGEX_CHARACTERS_ALLOWED);
    Matcher m = p.matcher(dnaRowSequence);
    return m.matches();
  }
}
