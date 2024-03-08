package dat3.recipe.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.recipe.entity.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDto {

    private String name;

    public CategoryDto(Category c) {
        this.name = c.getName();
    }
}
