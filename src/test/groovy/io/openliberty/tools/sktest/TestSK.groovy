package io.openliberty.tools.sktest;

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test


import java.io.File
import org.junit.Test
import org.junit.Assert;
import io.openliberty.tools.gradle.tasks.DeployTask

public class TestSK {

	static File dir1 = new File("src/test/resources/loose-ear-test")
    static File dir2 = new File("src/test/resources/loose-ear-test/ejb-war/build/resources/main")
    

    @Test
    public void test1() {
		String retVal = DeployTask.getProjectPath(dir1, dir2)
		assert retVal == "ejb-war"		
    }
}
