package day12.lambda;

public interface GenericFunction<X, Y> {

    // x 를 주면 y를 뱉어줄게
    Y apply (X x);


}
