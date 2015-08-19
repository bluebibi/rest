package link.rest.domain;

//For Mybatis Test

import org.apache.commons.lang.builder.ToStringBuilder;

public class Test {
    private int id;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);

    }

}
