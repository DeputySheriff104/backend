package ru.relex.delivery.services.validation;

import java.util.Map;

public final class ValidationErrorsOrder {
    private ValidationErrorsOrder() {
    }
    public static final String CITY_LENGTH_IS_INVALID = "CITY_LENGTH_LENGTH_IS_INVALID";
    public static final String STREET_LENGTH_IS_INVALID = "STREET_LENGTH_IS_INVALID";
    public static final String HOUSE_LENGTH_IS_INVALID = "HOUSE_LENGTH_IS_INVALID";
    public static final String FLAT_LENGTH_IS_INVALID = "FLAT_LENGTH_IS_INVALID";
    public static final String ENTRANCE_LENGTH_IS_INVALID = "ENTRANCE_LENGTH_IS_INVALID";
    public static final String FLOOR_LENGTH_IS_INVALID = "FLOOR_LENGTH_IS_INVALID";

    public static final String LAST_NAME_LENGTH_IS_INVALID = "LAST_NAME_LENGTH_IS_INVALID";
    public static final String FIRST_NAME_LENGTH_IS_INVALID = "FIRST_NAME_LENGTH_IS_INVALID";
    public static final String PERSONAL_INFO_MUST_BE_SET = "PERSONAL_INFO_MUST_BE_SET";
    public static final String LIST_OF_DISHES_MUST_BE_SET = "LIST_OF_DISHES_MUST_BE_SET";
    private static final Map<String, String> ERRORS = Map.ofEntries(



    );

    public static String getMessageByCode(String code) {
        return ERRORS.get(code);
    }

}
