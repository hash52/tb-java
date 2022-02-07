/*
    総称型 （ジェネリクス: Generics）
*/
public class GenericSample<T> {
    //インスタンス生成時に型を指定したい場合、総称型にする。仮型引数には大文字一文字、通常、T (Type の意味) 、E (Element の意味) を使用
    private T value;
  
    public void setValue(T val) {
      this.value = val;
    }
  
    public T getValue() {
      return this.value;
    }

    //引数に総称型を用いる
    public static <T> T methodSample(T value) {
        return value;
    }

    public static void main(String[] args) {
        GenericSample<String> sample = new GenericSample<>();
        sample.setValue("sample");
        System.out.println(sample.getValue().getClass().getSimpleName());

        //自動で型が判定されるため呼び出し時に<>は不要
        System.out.println(GenericSample.methodSample("sample").getClass().getSimpleName());
        System.out.println(GenericSample.methodSample(1).getClass().getSimpleName());
    }
  }