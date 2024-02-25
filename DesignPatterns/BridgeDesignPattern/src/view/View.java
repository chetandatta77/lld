package view;

import Resource.IResource;

public abstract class View {

    IResource resource;

    View(IResource resource){
        this.resource = resource;
    }

    public abstract String show();
}
