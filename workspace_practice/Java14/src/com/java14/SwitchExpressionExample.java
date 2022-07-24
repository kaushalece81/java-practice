package com.java14;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		SwitchExpressionExample object = new SwitchExpressionExample();
		int numberOfRoomsBasedOnBudget = object.getNumberOfRoomsBasedOnBudgetUsingTraditionalSwitch(20000);
		System.out.println("numberOfRoomsBasedOnBudget ::"+numberOfRoomsBasedOnBudget);
		
		int numberOfRoomsBasedOnBudgetSwitchExpressionWay1 = object.getNumberOfRoomsBasedOnBudgetUsingSwitchExpressionWay1(20000);
		System.out.println("numberOfRoomsBasedOnBudget modern switch expression way1 ::"+numberOfRoomsBasedOnBudgetSwitchExpressionWay1);
		int numberOfRoomsBasedOnBudgetSwitchExpressionWay2 = object.getNumberOfRoomsBasedOnBudgetUsingReturnSwitchExpressionWay2(20000);
		System.out.println("numberOfRoomsBasedOnBudget modern switch expression way2 ::"+numberOfRoomsBasedOnBudgetSwitchExpressionWay2);
		
		int numberOfRoomDiscountSwitchExpressionUsingYield = object.getNumberOfRoomDiscountSwitchExpressionUsingYield(50000);
		System.out.println("numberOfRoomsBasedOnBudget modern switch expression with yield ::"+numberOfRoomDiscountSwitchExpressionUsingYield);

		int numberOfRoomDiscountSwitchExpressionWithOldCaseUsingColon = object.getNumberOfRoomDiscountSwitchExpressionWithOldCaseUsingColon(50000);
		System.out.println("numberOfRoomsBasedOnBudget modern switch expression with yield old case colon ::"+numberOfRoomDiscountSwitchExpressionWithOldCaseUsingColon);

	}

	public int getNumberOfRoomsBasedOnBudgetUsingTraditionalSwitch(int budget) {
		int numberOfRooms = 0;
		switch (budget) {
		case 10000:
			numberOfRooms = 1;
			break;
		case 20000,30000:
			numberOfRooms = 2;
			break;
		case 40000,50000:
			numberOfRooms = 3;
			break;
		default:
			System.out.println("Invalid value");
		}
		return numberOfRooms;
	}
	
	public int getNumberOfRoomsBasedOnBudgetUsingSwitchExpressionWay1(int budget) {
		int numberOfRooms =switch (budget) {
		case 10000-> 1;
		case 20000,30000->2;
		case 40000,50000-> 3;
		default -> throw new IllegalStateException("No Rooms available for this budget");
		};
		return numberOfRooms;
	}
	
	public int getNumberOfRoomsBasedOnBudgetUsingReturnSwitchExpressionWay2(int budget) {
		return switch (budget) {
		case 10000-> 1;
		case 20000,30000->2;
		case 40000,50000-> 3;
		default -> throw new IllegalStateException("No Rooms available for this budget");
		};
	}
	
	public int getNumberOfRoomDiscountSwitchExpressionUsingYield(int budget) {
		return switch (budget) {
		case 10000-> 1;
		case 20000,30000->{
			int finalPrice =( budget ==30000) ? budget-10000 : budget;
			System.out.println("finalPrice after discount ::"+finalPrice);
			yield 2;  // instead of break we use yield and its used to return value
		}
		case 40000,50000-> {
			int finalPrice =( budget ==50000) ? budget-10000 : budget;
			System.out.println("finalPrice after discount ::"+finalPrice);
			yield 3; // instead of break we use yield and its used to return value
		}
		default -> throw new IllegalStateException("No Rooms available for this budget");
		};
	}
	
	public int getNumberOfRoomDiscountSwitchExpressionWithOldCaseUsingColon(int budget) {
		return switch (budget) {
		case 10000 : {
			yield 1;
		}
		case 20000,30000 : {
			int finalPrice =( budget ==30000) ? budget-10000 : budget;
			System.out.println("finalPrice after discount ::"+finalPrice);
			yield 2;  // instead of break we use yield and its used to return value
		}
		case 40000,50000 : {
			int finalPrice =( budget ==50000) ? budget-10000 : budget;
			System.out.println("finalPrice after discount ::"+finalPrice);
			yield 3; // instead of break we use yield and its used to return value
		}
		default : throw new IllegalStateException("No Rooms available for this budget");
		};
	}

}
