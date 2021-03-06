package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail")
public class DetailBean {
	@OneToOne
	@JoinColumn(
			name = "photoid",
			referencedColumnName = "id"
	)
	private ProductBean product;
	public ProductBean getProduct() {
		return product;
	}
	public void setProduct(ProductBean product) {
		this.product = product;
	}

	@Id
	private Integer photoid;
	private byte[] photo;
	
	@Override
	public String toString() {
		return "DetailBean [photoid=" + photoid + "]";
	}
	public Integer getPhotoid() {
		return photoid;
	}
	public void setPhotoid(Integer photoid) {
		this.photoid = photoid;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
}
