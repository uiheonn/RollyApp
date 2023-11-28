package S3Test;

import com.amazonaws.services.s3.AmazonS3Client;
import com.example.RollyTest1.S3.S3Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = S3Service.class)
public class S3ServiceTest {

    @Autowired
    private S3Service s3Service;

    @Autowired
    private AmazonS3Client amazonS3Client;

    @Test
    public void getBucket(){
        System.out.println(s3Service.getBucketName());
    }

    @DisplayName("저장된 이미지 찾기")
    @Test
    public void findImg() {
        String result = amazonS3Client.getUrl(s3Service.getBucketName(), "coffee.png").toString();
        System.out.println(result);
        //log.info(imgPath);
        //Assertions.assertThat(imgPath).isNotNull();
    }

}
