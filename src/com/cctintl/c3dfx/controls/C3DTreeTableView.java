package com.cctintl.c3dfx.controls;

import javafx.scene.control.Skin;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableRow;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;

import com.cctintl.c3dfx.skins.C3DTreeTableViewSkin;

/**
 * @author sshahine
 *
 * @param <S>
 */

public class C3DTreeTableView<S> extends TreeTableView<S> {

	public C3DTreeTableView(TreeItem<S> root) {
		super(root);
		this.setRowFactory(new Callback<TreeTableView<S>, TreeTableRow<S>>() {
			@Override
			public TreeTableRow<S> call(TreeTableView<S> param) {
				return new C3DTreeTableRow<S>();
			}
		});				
	}
	
    /** {@inheritDoc} */
    @Override protected Skin<?> createDefaultSkin() {
        return new C3DTreeTableViewSkin<S>(this);
    }
	
	public C3DTreeTableView() {
		super();
	}
	
}
