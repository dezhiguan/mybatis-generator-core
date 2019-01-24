import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AppStart {

    public static void main(String[] args) throws Exception {
        try {
            generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        InputStream is = AppStart.class.getClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }

}
