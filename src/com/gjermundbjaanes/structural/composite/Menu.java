package com.gjermundbjaanes.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {

        this.name = name;
        this.url = url;

    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(print());

        for (MenuComponent menuComponent : menuComponents) {
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }
}
