package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DescAscSort {

    private final List<Post> posts = new ArrayList<>();
    public List<Post> findAll(Integer size, Integer from, String sort) {
        return posts.stream().sorted((p0, p1) -> {
            int comp = p0.getCreationDate().compareTo(p1.getCreationDate()); //прямой порядок сортировки
            if(sort.equals("desc")){
                comp = -1 * comp; //обратный порядок сортировки
            }
            return comp;
        }).skip(from).limit(size).collect(Collectors.toList());
    }
}
