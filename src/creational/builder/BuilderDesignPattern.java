package creational.builder;

public class BuilderDesignPattern {

    private String name;
    private String rollNo;
    private String id;

    public BuilderDesignPattern(Builder design) {
        this.name = design.name;
        this.rollNo = design.rollNo;
        this.id = design.id;
    }
    public static Builder builder() {
        return new Builder();
    }
    @Override
    public String toString() {
        return "BuilderDesignPattern{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

   public static class Builder {
        private String name;
        private String rollNo;
        private String id;

        public Builder name(String name) {
            this.name = name;
            return this;

        }

        public Builder rollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public BuilderDesignPattern build() {
            return new BuilderDesignPattern(this);
        }
    }
}


