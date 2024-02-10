package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat
{
    private String name = "boris";
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return ("Cat named " + name);
    }
}
