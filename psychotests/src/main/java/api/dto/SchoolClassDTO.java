package api.dto;

import entity.SchoolClassEntity;
import entity.SchoolEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class SchoolClassDTO {

    @NonNull
    Long id;

    @NonNull
    String name;

    @NonNull
    SchoolDTO school;

//    public static List<SchoolDTO> createSchoolClassDTOList(List<SchoolClassEntity> entities) {
//
//        return entities
//                .stream()
//                .map(this::createSchoolClassDTO)
//                .collect(Collectors.toList());
//    }
}
