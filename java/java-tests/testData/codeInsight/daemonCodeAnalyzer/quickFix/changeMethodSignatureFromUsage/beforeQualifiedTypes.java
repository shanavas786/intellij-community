// "Change signature of 'Inner2()' to 'Inner2(CoolTest.Inner1)'" "true"
class CoolTest {
class Inner1 {}

void method() {
new Inner2(new In<caret>ner1());
}

class Inner2 {
Inner2() { }
}
}