import { DiscountPrice } from "@/components/atoms/Span/DiscountPrice";
import { OrigialPrice } from "@/components/atoms/Span/OriginalPrice";
import "./MenuPrices.scss";

export function MenuPrices({ discountPrice, originalPrice }) {
  return (
    <div className="menu-article__prices">
      {discountPrice && <DiscountPrice discountPrice={discountPrice} />}
      <OrigialPrice
        discountPrice={discountPrice}
        originalPrice={originalPrice}
      />
    </div>
  );
}
