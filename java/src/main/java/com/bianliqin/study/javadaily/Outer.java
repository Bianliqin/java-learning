package com.bianliqin.study.javadaily;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/11/3
 **/
 class Outer {
        private String name = "OuterClass";
        public void sayHi(){
            //外部类访问内部类
            System.out.println(new Inner().name);
            System.out.println("Hi OuterClass");

            class OutClass{
                public void sayHi(){
                    class  InnerClass{
                        InnerClass(String name){
                            System.out.println("InnerClass:"+name);
                        }
                    }
                    System.out.println(new InnerClass("Three"));
                    System.out.println("Hi,OuterClass");
                }
            }
            class OutTest{
                public void main(String[] args) {
                    new OutClass().sayHi();
                }
            }
        }
        public Outer(){
            System.out.println("Outer Class.");
        }
        class Inner{
            String name = "InnerClass";
            public void asyHi(){
                //内部类访问外部类
                Outer.this.sayHi();
                System.out.println("Hi,Inner.");
            }
        }
        /**
         * 成员类的创建和使用
         */
        public static void main(String[] args){
            Outer out = new Outer();
            //创建成员内部类
            Outer.Inner inner = out.new Inner();
            inner.asyHi();
        }
    }

    class OuterClass{
        public OuterClass(){
            System.out.println("OuterClass Init.");
        }
        protected static class InnerClass{
            public void sayHi(){
                System.out.println("Hi,InnerClass");
            }
        }
    }
    class InnerClassTest{
        public static void main(String[] args) {
            OuterClass.InnerClass innerClass =new OuterClass.InnerClass();
            innerClass.sayHi();
        }
    }
