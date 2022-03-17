package ast;

public class ClassName extends Name{

    public ClassName(String name) {
        super(name);
        this.setName(formatClassName(getName()));
    }

    /**
     * REQUIRES: The parameter "name" starts from alphabet [a-zA-Z]
     *
     * @param name: String value for class name
     * @return reformatted class name. i.e. The first character is capitalized.
     */
    public String formatClassName(String name) {
        String result = name;
        char first_char = name.charAt(0);
        if(!Character.isUpperCase(first_char)) {
            result = Character.toString(first_char).toUpperCase() + name.substring(1);
        }

        return result;
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
