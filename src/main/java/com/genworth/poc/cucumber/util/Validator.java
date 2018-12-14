package com.genworth.poc.cucumber.util;

import com.genworth.poc.cucumber.model.ValidationError;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Validator {

    public Stream<ValidationError> validateNumericString(String input){
        return !StringUtils.isNumeric(input) ? Arrays.asList(new ValidationError("Invalid " +
                "Data Type")).stream() : Stream.of();
    }

}
