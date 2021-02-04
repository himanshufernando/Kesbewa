package tkhub.project.kesbewa;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tkhub.project.kesbewa.databinding.DialogBottomsheetCartBindingImpl;
import tkhub.project.kesbewa.databinding.DialogNoteBindingImpl;
import tkhub.project.kesbewa.databinding.DialogQuantityBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentAddressBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentCartBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentCheckOutBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentHomeBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentLoginBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentMapsBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentProductDetailBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentProfileBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentPromoCodeBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentResetPasswordBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentSingupBindingImpl;
import tkhub.project.kesbewa.databinding.FragmentSingupGoogleBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewAddressBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewCartitemsBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewHistoryOrderItemBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewOrdersBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewOrdersPastBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductColorBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductImageGalleryBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductImagesBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductLargeImagesBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductSizeBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductsBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewProductsCheckoutBindingImpl;
import tkhub.project.kesbewa.databinding.ListviewSearchAddressBindingImpl;
import tkhub.project.kesbewa.databinding.TestBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_DIALOGBOTTOMSHEETCART = 1;

  private static final int LAYOUT_DIALOGNOTE = 2;

  private static final int LAYOUT_DIALOGQUANTITY = 3;

  private static final int LAYOUT_FRAGMENTADDRESS = 4;

  private static final int LAYOUT_FRAGMENTCART = 5;

  private static final int LAYOUT_FRAGMENTCHECKOUT = 6;

  private static final int LAYOUT_FRAGMENTHOME = 7;

  private static final int LAYOUT_FRAGMENTLOGIN = 8;

  private static final int LAYOUT_FRAGMENTMAPS = 9;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 10;

  private static final int LAYOUT_FRAGMENTPROFILE = 11;

  private static final int LAYOUT_FRAGMENTPROMOCODE = 12;

  private static final int LAYOUT_FRAGMENTRESETPASSWORD = 13;

  private static final int LAYOUT_FRAGMENTSINGUP = 14;

  private static final int LAYOUT_FRAGMENTSINGUPGOOGLE = 15;

  private static final int LAYOUT_LISTVIEWADDRESS = 16;

  private static final int LAYOUT_LISTVIEWCARTITEMS = 17;

  private static final int LAYOUT_LISTVIEWHISTORYORDERITEM = 18;

  private static final int LAYOUT_LISTVIEWORDERS = 19;

  private static final int LAYOUT_LISTVIEWORDERSPAST = 20;

  private static final int LAYOUT_LISTVIEWPRODUCTCOLOR = 21;

  private static final int LAYOUT_LISTVIEWPRODUCTIMAGEGALLERY = 22;

  private static final int LAYOUT_LISTVIEWPRODUCTIMAGES = 23;

  private static final int LAYOUT_LISTVIEWPRODUCTLARGEIMAGES = 24;

  private static final int LAYOUT_LISTVIEWPRODUCTSIZE = 25;

  private static final int LAYOUT_LISTVIEWPRODUCTS = 26;

  private static final int LAYOUT_LISTVIEWPRODUCTSCHECKOUT = 27;

  private static final int LAYOUT_LISTVIEWSEARCHADDRESS = 28;

  private static final int LAYOUT_TEST = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.dialog_bottomsheet_cart, LAYOUT_DIALOGBOTTOMSHEETCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.dialog_note, LAYOUT_DIALOGNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.dialog_quantity, LAYOUT_DIALOGQUANTITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_address, LAYOUT_FRAGMENTADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_check_out, LAYOUT_FRAGMENTCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_maps, LAYOUT_FRAGMENTMAPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_promo_code, LAYOUT_FRAGMENTPROMOCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_reset_password, LAYOUT_FRAGMENTRESETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_singup, LAYOUT_FRAGMENTSINGUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.fragment_singup_google, LAYOUT_FRAGMENTSINGUPGOOGLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_address, LAYOUT_LISTVIEWADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_cartitems, LAYOUT_LISTVIEWCARTITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_history_order_item, LAYOUT_LISTVIEWHISTORYORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_orders, LAYOUT_LISTVIEWORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_orders_past, LAYOUT_LISTVIEWORDERSPAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_product_color, LAYOUT_LISTVIEWPRODUCTCOLOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_product_image_gallery, LAYOUT_LISTVIEWPRODUCTIMAGEGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_product_images, LAYOUT_LISTVIEWPRODUCTIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_product_large_images, LAYOUT_LISTVIEWPRODUCTLARGEIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_product_size, LAYOUT_LISTVIEWPRODUCTSIZE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_products, LAYOUT_LISTVIEWPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_products_checkout, LAYOUT_LISTVIEWPRODUCTSCHECKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.listview_search_address, LAYOUT_LISTVIEWSEARCHADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(tkhub.project.kesbewa.R.layout.test, LAYOUT_TEST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_DIALOGBOTTOMSHEETCART: {
          if ("layout/dialog_bottomsheet_cart_0".equals(tag)) {
            return new DialogBottomsheetCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_bottomsheet_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGNOTE: {
          if ("layout/dialog_note_0".equals(tag)) {
            return new DialogNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_note is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGQUANTITY: {
          if ("layout/dialog_quantity_0".equals(tag)) {
            return new DialogQuantityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_quantity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDRESS: {
          if ("layout/fragment_address_0".equals(tag)) {
            return new FragmentAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_address is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKOUT: {
          if ("layout/fragment_check_out_0".equals(tag)) {
            return new FragmentCheckOutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_check_out is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAPS: {
          if ("layout/fragment_maps_0".equals(tag)) {
            return new FragmentMapsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_maps is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROMOCODE: {
          if ("layout/fragment_promo_code_0".equals(tag)) {
            return new FragmentPromoCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_promo_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESETPASSWORD: {
          if ("layout/fragment_reset_password_0".equals(tag)) {
            return new FragmentResetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_reset_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSINGUP: {
          if ("layout/fragment_singup_0".equals(tag)) {
            return new FragmentSingupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_singup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSINGUPGOOGLE: {
          if ("layout/fragment_singup_google_0".equals(tag)) {
            return new FragmentSingupGoogleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_singup_google is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWADDRESS: {
          if ("layout/listview_address_0".equals(tag)) {
            return new ListviewAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_address is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWCARTITEMS: {
          if ("layout/listview_cartitems_0".equals(tag)) {
            return new ListviewCartitemsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_cartitems is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWHISTORYORDERITEM: {
          if ("layout/listview_history_order_item_0".equals(tag)) {
            return new ListviewHistoryOrderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_history_order_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWORDERS: {
          if ("layout/listview_orders_0".equals(tag)) {
            return new ListviewOrdersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_orders is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWORDERSPAST: {
          if ("layout/listview_orders_past_0".equals(tag)) {
            return new ListviewOrdersPastBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_orders_past is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTCOLOR: {
          if ("layout/listview_product_color_0".equals(tag)) {
            return new ListviewProductColorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_product_color is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTIMAGEGALLERY: {
          if ("layout/listview_product_image_gallery_0".equals(tag)) {
            return new ListviewProductImageGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_product_image_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTIMAGES: {
          if ("layout/listview_product_images_0".equals(tag)) {
            return new ListviewProductImagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_product_images is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTLARGEIMAGES: {
          if ("layout/listview_product_large_images_0".equals(tag)) {
            return new ListviewProductLargeImagesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_product_large_images is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTSIZE: {
          if ("layout/listview_product_size_0".equals(tag)) {
            return new ListviewProductSizeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_product_size is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTS: {
          if ("layout/listview_products_0".equals(tag)) {
            return new ListviewProductsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_products is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWPRODUCTSCHECKOUT: {
          if ("layout/listview_products_checkout_0".equals(tag)) {
            return new ListviewProductsCheckoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_products_checkout is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWSEARCHADDRESS: {
          if ("layout/listview_search_address_0".equals(tag)) {
            return new ListviewSearchAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_search_address is invalid. Received: " + tag);
        }
        case  LAYOUT_TEST: {
          if ("layout/test_0".equals(tag)) {
            return new TestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for test is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(25);

    static {
      sKeys.put(1, "ResetBindingView");
      sKeys.put(0, "_all");
      sKeys.put(2, "addresItem");
      sKeys.put(3, "addressviewmodel");
      sKeys.put(4, "cart_details");
      sKeys.put(5, "cartitem");
      sKeys.put(6, "checkout");
      sKeys.put(7, "clickListener");
      sKeys.put(8, "item");
      sKeys.put(9, "loginBindingView");
      sKeys.put(10, "mapBindingView");
      sKeys.put(11, "orderitem");
      sKeys.put(12, "orderitems");
      sKeys.put(13, "pastorderitems");
      sKeys.put(14, "product");
      sKeys.put(15, "product_details");
      sKeys.put(16, "productdetailsbottomsheet");
      sKeys.put(17, "products");
      sKeys.put(18, "profile_view_model");
      sKeys.put(19, "promo_binding_view");
      sKeys.put(20, "scrollChangeListener");
      sKeys.put(21, "singupBindingView");
      sKeys.put(22, "singup_google_binding_view");
      sKeys.put(23, "user");
      sKeys.put(24, "viewmodelqtydialog");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(29);

    static {
      sKeys.put("layout/dialog_bottomsheet_cart_0", tkhub.project.kesbewa.R.layout.dialog_bottomsheet_cart);
      sKeys.put("layout/dialog_note_0", tkhub.project.kesbewa.R.layout.dialog_note);
      sKeys.put("layout/dialog_quantity_0", tkhub.project.kesbewa.R.layout.dialog_quantity);
      sKeys.put("layout/fragment_address_0", tkhub.project.kesbewa.R.layout.fragment_address);
      sKeys.put("layout/fragment_cart_0", tkhub.project.kesbewa.R.layout.fragment_cart);
      sKeys.put("layout/fragment_check_out_0", tkhub.project.kesbewa.R.layout.fragment_check_out);
      sKeys.put("layout/fragment_home_0", tkhub.project.kesbewa.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", tkhub.project.kesbewa.R.layout.fragment_login);
      sKeys.put("layout/fragment_maps_0", tkhub.project.kesbewa.R.layout.fragment_maps);
      sKeys.put("layout/fragment_product_detail_0", tkhub.project.kesbewa.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_profile_0", tkhub.project.kesbewa.R.layout.fragment_profile);
      sKeys.put("layout/fragment_promo_code_0", tkhub.project.kesbewa.R.layout.fragment_promo_code);
      sKeys.put("layout/fragment_reset_password_0", tkhub.project.kesbewa.R.layout.fragment_reset_password);
      sKeys.put("layout/fragment_singup_0", tkhub.project.kesbewa.R.layout.fragment_singup);
      sKeys.put("layout/fragment_singup_google_0", tkhub.project.kesbewa.R.layout.fragment_singup_google);
      sKeys.put("layout/listview_address_0", tkhub.project.kesbewa.R.layout.listview_address);
      sKeys.put("layout/listview_cartitems_0", tkhub.project.kesbewa.R.layout.listview_cartitems);
      sKeys.put("layout/listview_history_order_item_0", tkhub.project.kesbewa.R.layout.listview_history_order_item);
      sKeys.put("layout/listview_orders_0", tkhub.project.kesbewa.R.layout.listview_orders);
      sKeys.put("layout/listview_orders_past_0", tkhub.project.kesbewa.R.layout.listview_orders_past);
      sKeys.put("layout/listview_product_color_0", tkhub.project.kesbewa.R.layout.listview_product_color);
      sKeys.put("layout/listview_product_image_gallery_0", tkhub.project.kesbewa.R.layout.listview_product_image_gallery);
      sKeys.put("layout/listview_product_images_0", tkhub.project.kesbewa.R.layout.listview_product_images);
      sKeys.put("layout/listview_product_large_images_0", tkhub.project.kesbewa.R.layout.listview_product_large_images);
      sKeys.put("layout/listview_product_size_0", tkhub.project.kesbewa.R.layout.listview_product_size);
      sKeys.put("layout/listview_products_0", tkhub.project.kesbewa.R.layout.listview_products);
      sKeys.put("layout/listview_products_checkout_0", tkhub.project.kesbewa.R.layout.listview_products_checkout);
      sKeys.put("layout/listview_search_address_0", tkhub.project.kesbewa.R.layout.listview_search_address);
      sKeys.put("layout/test_0", tkhub.project.kesbewa.R.layout.test);
    }
  }
}
