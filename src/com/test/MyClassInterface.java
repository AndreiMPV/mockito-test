package com.test;
public interface MyClassInterface {

    public class InnerClassMyClass {

        public InnerClassMyClass(String err) {
            this.err = err;
        }

        public InnerClassMyClass() {
        }

        public String err;


        @Override
        public String toString() {
            String s = "DOB:" ;
            if (err != null) {
                s += ", Err: " + err;
            }
            return s;
        }
    }
}
