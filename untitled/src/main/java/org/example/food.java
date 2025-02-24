package org.example;

public class food {
    public abstract class Food {
        private String color;
        private double size;

        public Food(String color, double size) {
            this.color = color;
            this.size = size;
        }

        public String getColour() {
            return color;
        }

        public double getSize() {
            return size;
        }


        public abstract String getDescription();

    }

}
