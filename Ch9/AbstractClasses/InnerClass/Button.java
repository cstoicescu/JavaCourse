package Ch9.AbstractClasses.InnerClass;

import lombok.Getter;

public class Button {
    @Getter
    private String title;
    private OnClickListener onClickListener;

    public Button ( String title ) {
        this.title = title;
    }

    public void setOnClickListener( OnClickListener onClickListener) {
    this.onClickListener = onClickListener;
    }

    public void OnClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }


}
