package kr.codesquad.sidedish.web.dto.item;

import kr.codesquad.sidedish.domain.Item;

public class ItemResponseDto {

    private final Long itemId;
    private final Long categoryId;
    private final String itemName;
    private final String description;
    private final Long originalPrice;
    private final Long discountPrice;
    private final Integer labelId;
    private final String mainImage;
    private final Integer deliveryId;
    private final Long bestId;

    public ItemResponseDto(Long itemId, Long categoryId, String itemName, String description,
                           Long originalPrice, Long discountPrice, Integer labelId,
                           String mainImage, Integer deliveryId, Long bestId) {
        this.itemId = itemId;
        this.categoryId = categoryId;
        this.itemName = itemName;
        this.description = description;
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
        this.labelId = labelId;
        this.mainImage = mainImage;
        this.deliveryId = deliveryId;
        this.bestId = bestId;
    }

    public static ItemResponseDto of(Item item) {
        return new ItemResponseDto(item.getItemId(),
                item.getCategoryId(),
                item.getItemName(),
                item.getDescription(),
                item.getOriginalPrice(),
                item.getDiscountPrice(),
                item.getLabelId(),
                item.getMainImage(),
                item.getDeliveryId(),
                item.getBestId());
    }

    public Long getItemId() {
        return itemId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public Long getDiscountPrice() {
        return discountPrice;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public String getMainImage() {
        return mainImage;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public Long getBestId() {
        return bestId;
    }
}
