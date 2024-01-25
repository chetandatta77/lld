package Solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String directoryName;

    private List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name "+ directoryName);
        for (FileSystem fileSystemObj: fileSystemList){
            fileSystemObj.ls();
        }
    }
}
