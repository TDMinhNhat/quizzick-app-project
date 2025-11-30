package io.github.tdminhnhat.project.quizzick.core.util;

import org.springframework.web.multipart.MultipartFile;

public class ValidateFileUtil {

    public static boolean validateImageFileExtension(MultipartFile file) {
        String fileName = file.getResource().getFilename();
        return fileName != null && (fileName.endsWith(".png") || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg"));
    }

    public static boolean validateIconFileExtension(MultipartFile file) {
        String fileName = file.getResource().getFilename();
        return fileName != null && fileName.endsWith(".ico");
    }
}
