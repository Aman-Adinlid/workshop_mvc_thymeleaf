package lexicon.se.workshop.converter;

import java.util.List;

public interface Converter<T, U> {

    T toModel(U dto);

    U toDto(T model);

    List<T> toModels(List<U> list);

    List<U> toDto(List<T> list);
}


