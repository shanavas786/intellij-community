// "Change signature of 'f(int, String)' to 'f(int, char, int, String, int, Object)'" "true"
class A {
    void f(int i, char c, int i1, String s, int i2, Object o) {}
    public void foo() {
        <caret>f(1,'2',4,"",1,null);
    }
}