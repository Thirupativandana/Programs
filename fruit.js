class Fruit {
    
    constructor(title,price){
        this.title=title;
        this.price=price;                                             
    }

    estimateFor(quantity){
        return quantity*this.price;
    }

    discountedEstimateFor(quantity,discPercent){
        let estimate = this.estimateFor(quantity);
        return estimate * discPercent/100;
    }

    static getShopTitle(){
        return "Sri lakshmi super Mart";
    }
}


console.log(Fruit.getShopTitle());


f1 = new Fruit("pineapple",45);

console.log(f1);
console.log(f1.estimateFor(100));
console.log(f1.discountedEstimateFor(100,25));