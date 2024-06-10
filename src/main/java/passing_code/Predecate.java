package passing_code;

public interface Predecate<T> {
    boolean test(T t);
}

/* Functional Interface
   - Là một interface trong Java có đúng một phương thức trừu tượng (abstract method).
   - Được giới thiệu cùng Lambda Expressions và Method References => để hỗ trợ Functional programming.
 */