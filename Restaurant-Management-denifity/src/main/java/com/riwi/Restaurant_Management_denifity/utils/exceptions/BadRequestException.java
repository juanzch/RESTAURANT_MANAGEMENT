package com.riwi.Restaurant_Management_denifity.utils.exceptions;

public class BadRequestException extends RuntimeException {

    private static final String ERROR_MESSAGE = "No hay registros en la entidad %s con el id suministrado";
    public BadRequestException(String nameEntity) {
        super(String.format(ERROR_MESSAGE,nameEntity));
    }
}
