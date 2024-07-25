package com.yulan.wemedia.test;


import com.yulan.common.aliyun.GreenImageScan;
import com.yulan.common.aliyun.GreenTextScan;
import com.yulan.file.service.FileStorageService;
import com.yulan.wemedia.WemediaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = WemediaApplication.class)
@RunWith(SpringRunner.class)
public class AliyunTest {

    @Autowired
    private GreenTextScan greenTextScan;

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    private GreenImageScan greenImageScan;

    /**
     * 测试文本内容审核
     */
    @Test
    public void testScanText() throws Exception {
        Map map = greenTextScan.greeTextScan("我是一个好人,冰毒");
        System.out.println(map);
    }

    /**
     * 测试图片审核
     */
    @Test
    public void testScanImage() throws Exception {

        byte[] bytes = fileStorageService.downLoadFile("http://192.168.200.130:9000/leadnews/2021/04/26/07caf2be1520457e9fe59f2969eebf65.jpg");

        List<byte []> list = new ArrayList<>();
        list.add(bytes);

        Map map = greenImageScan.imageScan(list);
        System.out.println(map);

    }
}
