package Builder;

public class PatternBuilder {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Карбонара", 150, 30).setForm("Квадратная").build();
        System.out.println(pizza);
    }
}

    class Pizza {
        private String name;
        private int weight ;
        private int size;
        private String form;

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getSize() {
            return size;
        }

        public String getForm() {
            return form;
        }

        public Pizza(Builder builder) {
            this.name = builder.name;
            this.weight = builder.weight;
            this.size = builder.size;
            this.form = builder.form = "Круглая";
        }

        @Override
        public String toString(){
            return "Название пиццы:" + name + ",  Вес:" + weight + ",  Размер:" + size + ",  Форма:" + form;
        }

        static class Builder{
            private String name;
            private int weight ;
            private int size;
            private String form;

            public Builder(String name, int weight, int size) {
                this.name = name;
                this.weight = weight;
                this.size = size;
            }

            public Builder setForm(String form) {
                this.form = form;
                return this;
            }

            public Pizza build(){
                return new Pizza(this);
            }
        }

    }


