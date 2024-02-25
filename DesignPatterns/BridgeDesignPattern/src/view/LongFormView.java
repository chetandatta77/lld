package view;

import Resource.IResource;

public class LongFormView extends View{
    LongFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return this.resource.snippet();
    }
}
