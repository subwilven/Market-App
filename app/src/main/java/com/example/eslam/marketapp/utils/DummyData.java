package com.example.eslam.marketapp.utils;

import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Category> getCategories(long pageKey) {
        List<Category> categories = new ArrayList<>();
        switch ((int) pageKey) {
            case 1:
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUyNTgxNjc5NjcwNjMzNzU1/green-giant-butternut-squash-veggie-spirals-103244748.webp"
                        , "Green Giant Butternut"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_385/MTUyNTgxNzE5OTM1OTUyMTU1/mina-tagine-moroccan-chicken-sauce-103244754.webp"
                        , "Mina Tagine Moroccan"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUyNTgxNjk1Nzc2NzYxMTE1/middles-plain-bread-stuffed-103244753.webp",
                        "Middles Plain Bread"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTU0MjI2MDE4NjM3MzI1Njc4/super-herb-tea-fennel-103284718.webp",
                        "The Republic of Tea"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTU0MjI1OTI2ODMyNDY1MjMy/haagen-dazs-ice-cream-squares-103329750.webp",
                        "Haagen-Dazs Dulce"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_636/MTU0MjI2MzUzMzc2MzM5MzEw/les-trois-petits-chochons-chicken-sausages-103285357.webp",
                        "Les Trois Petits Cochons"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTU0MjI1OTcwODU1ODE0NTEw/kettle-brand-wood-smoked-sea-salt-103285356.webp",
                        "Kettle Brand Almond"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ1OTQ0NjY0ODI5MjA4MjQ3/breakfast-hero-chocolate-multigrain-pancake-batter-102907637.webp",
                        "Honest Tea Unsweet"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ1OTQ0NjY0ODI5MjczODA1/bibigo-corean-style-fire-grilled-beef-rice-bowl-102907629.webp",
                        "Breakfast Hero"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ1OTQ0NjY0ODI5MzM5MzQx/coconut-cashew-coco-roons-salted-caramel-102907638.webp",
                        "Bibigo Korean"));
                break;
            case 2:
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ2NDExODU2MDcwNzgwNTQz/checkout-libbys-sweet-corn-pouch-0517-102955789.webp",
                        "Black Bean"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ2NDEyMDIyNzY5MTMzMDM3/checkout-giovanni-rana-ravioli-0517-102955788-copy.webp",
                        "Philadelphia Garden"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTQ5ODA4NDkzMTQzNzkx/lundberg-red-white-jasmine-0617-102995718.webp", "Organicgirl True Hearts"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTQ5ODA4MjI0NzA4MzM1/boulder-canyon-sea-salt-pepper-crisps-0617-102995721.webp",
                        "Lundberg Organic"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTQ5ODA4MjI0NzczODcx/egglands-best-peeled-eggs-0617-102995716.webp",
                        "Boulder Canyon"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUwMDA3MzgyMDM2OTgwNzk4/checkout-the-best-new-supermarket-products-for-october-2017-rr1017-103067048.webp",
                        "Montchevre"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUwMDc0MjIzMDAyMzk1NzEw/checkout-the-best-new-supermarket-products-for-october-2017-rr1017-103067047.webp",
                        "Frontera Chicken"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUwMDc0MjQwNzE5MTM1ODA2/checkout-the-best-new-supermarket-products-for-october-2017-rr1017-103067049.webp",
                        "Red Lobster Rosemary"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUxNDIxNTA2NzMwMTQwOTAy/la-brea-bakery-sweet-pecan-loaf-103183061.webp",
                        "La Brea Bakery"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUxNDIxNTA2NzMwMDc1MzY2/chickbean-crisps-103186700.webp", "Saffron Road"));
                break;
            case 3:
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUxNDIxNTA2NzMwMjA2NDYz/nielsen-massey-rosewater-103186702.webp",
                        "Nielsen-Massey"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUxNDIxNTA2NzMwMTQwOTI3/moes-chorizo-eggs-breakfast-bowl-103186698.webp",
                        "Moe's Chorizo"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTUxNDIxNTA2NzMwMDc1Mzkx/half-seas-bramble-103186704.webp",
                        "Half-Seas"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTYwNTg5NzAyODU3/checkout-kids-edition-0917-103044001.webp",
                        "Dole Go Berries!"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTAxMjY1NDY2NDIw/checkout-kids-edition-0917-103043984.webp",
                        "Noosa Mates"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTQ4NTEwMTA2Njc2/checkout-kids-edition-0917-103043998.webp",
                        "Crunchies Freeze"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTI1NjkzMTU4NDUy/checkout-kids-edition-0917-103043991.webp", "Hillshire Snacking "));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTY2MjI2ODQ3NDMz/checkout-kids-edition-0917-103044003.webp",
                        "Pirate’s Booty"));
                categories.add(new Category("https://www.rachaelraymag.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ5NDQ4OTE5Nzg3NTEzNTQ1/checkout-kids-edition-0917-103043985.webp",
                        "Blue Diamond"));
                categories.add(new Category("https://cdn.pixabay.com/photo/2015/03/30/20/33/heart-700141_960_720.jpg", "Theti7ina3"));
                break;
        }

        return categories;
    }

    public static List<Brand> getBrands(long page) {
        List<Brand> brands = new ArrayList<>();
        switch ((int) page) {
            case 1:
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-1.jpg"));
                brands.add(new Brand("http://www.noracfoods.com/wp-content/uploads/2017/06/Capture.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-2.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-3.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-4.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-5.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-6.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-7.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-8.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-9.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-10.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-11.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-12.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-13.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-14.jpg"));

                break;
            case 2:
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-15.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-16.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-17.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-18.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-19.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-20.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-21.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-22.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-23.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-24.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-25.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-26.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-27.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-28.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-29.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-30.jpg"));
                break;
            case 3:
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-31.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-32.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-33.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-34.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-35.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-36.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-37.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-38.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-39.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-40.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-41.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-42.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-43.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-44.jpg"));
                brands.add(new Brand("https://designmodo.com/wp-content/uploads/2011/09/Food-Logo-Design-45.jpg"));
                break;
        }



        return brands;
    }
}
