package jc01_2020.tsevan.test02;

public enum  Department {

    A1("Кухня"),
    A2("Рентген кабинет"),
    A3("МАЗ");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Department getDepartment(String value) {
        for (Department b : Department.values()) {
            if (b.value.equalsIgnoreCase(value)) {
                return b;
            }
        }
        return null;
    }

}
