package io.github.tdminhnhat.project.quizzick.service.controller;

import io.github.tdminhnhat.project.quizzick.core.controller.IController;
import io.github.tdminhnhat.project.quizzick.service.model.dto.UserDto;
import io.github.tdminhnhat.project.quizzick.service.model.vo.UserVo;
import io.github.tdminhnhat.project.quizzick.service.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

@RestController
@RequestMapping("/api/${api-path.user-controller}")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserController implements IController<UserDto, Long> {
    
    UserService userService;

    @PostMapping
    @Override
    public ResponseEntity<UserVo> add(@Valid @RequestBody UserDto request) throws Exception {
        return ResponseEntity.ok(userService.add(request));
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<UserVo> update(@PathVariable("id") Long id, @Valid @RequestBody UserDto request) throws Exception {
        return ResponseEntity.ok(userService.update(id, request));
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<UserVo> delete(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userService.delete(id));
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<UserVo> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userService.getById(id));
    }

    @GetMapping
    @Override
    public ResponseEntity<Collection<UserVo>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping(value = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Override
    public ResponseEntity<UserVo> uploadImage(@PathVariable("id") Long id, @RequestPart MultipartFile file) throws Exception {
        return ResponseEntity.ok(userService.uploadImage(id, file));
    }

    @DeleteMapping("/{id}/image")
    @Override
    public ResponseEntity<UserVo> deleteImage(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userService.deleteImage(id));
    }

    @GetMapping("/{id}/image")
    @Override
    public ResponseEntity<UserVo> getImage(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userService.getImage(id));
    }
}
