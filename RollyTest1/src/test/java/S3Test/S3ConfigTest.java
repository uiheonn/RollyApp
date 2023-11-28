package S3Test;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.example.RollyTest1.S3.S3Config;
import com.example.RollyTest1.S3.S3Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = S3Config.class)
public class S3ConfigTest {

    @Autowired
    private AmazonS3Client amazonS3Client;

    @Autowired
    S3Config s3Config;

    @Test
    public void testAmazonS3ClientBeanCreation() {
        // AmazonS3Client bean이 정상적으로 생성되었는지 확인
        assertNotNull(amazonS3Client);
        System.out.println(amazonS3Client);
        // AmazonS3Client의 다른 특정 기능을 테스트할 수도 있음
        // 예: assertNotNull(amazonS3Client.listBuckets());
    }
}