package com.demo.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.ecommerce.dto.LaptopDto;
import com.demo.ecommerce.dto.LaptopsDto;
import com.demo.ecommerce.dto.LoginDto;
import com.demo.ecommerce.dto.TvDto;
import com.demo.ecommerce.dto.TvsDto;
import com.demo.ecommerce.dto.UpdatePasswordDto;
import com.demo.ecommerce.dto.UpdateUserDetailsDto;
import com.demo.ecommerce.dto.UserDto;
import com.demo.ecommerce.dto.WatchDto;
import com.demo.ecommerce.dto.WatchesDto;
import com.demo.ecommerce.entities.Laptops;
import com.demo.ecommerce.entities.Tvs;
import com.demo.ecommerce.entities.User;
import com.demo.ecommerce.entities.Watches;
import com.demo.ecommerce.service.ProductsService;
import com.demo.ecommerce.service.UserService;

@SpringBootTest
class EcommerceProductsApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private ProductsService productsService;

	@Test
	void saveUser() {
		User user = new User();
		user.setId(6);
		user.setFirstName("ravi");
		user.setLastName("kumar");
		user.setEmail("ravi12@gmail.com");
		user.setPassword("Ravi12345");
		userService.saveUser(user);

	}

	@Test
	void saveUserFail() {
		User user = new User();
		user.setId(6);
		user.setFirstName("ravi");
		user.setLastName("karthik");
		user.setEmail("karthik12@gmail.com");
		user.setPassword("Karthik12345");
		userService.saveUser(user);

	}

	@Test
	void getUser() {
		userService.getUser();
	}

	@Test
	void updateUser() {
		UpdateUserDetailsDto updateUserDto = new UpdateUserDetailsDto();
		updateUserDto.setFirstName("ravisai");
		updateUserDto.setLastName("kumar");
		updateUserDto.setEmail("ravi12@gmail.com");
		userService.updateUser(updateUserDto, 6);

	}

	@Test
	void updateUserFail() {
		UpdateUserDetailsDto updateUserDto = new UpdateUserDetailsDto();
		updateUserDto.setFirstName("ravisai");
		updateUserDto.setLastName("kumar");
		updateUserDto.setEmail("ravi12@gmail.com");
		userService.updateUser(updateUserDto, 10);

	}

	@Test
	void saveUsers() {
		UserDto user = new UserDto();
		user.setId(7);
		user.setFirstName("pavi");
		user.setLastName("kumar");
		user.setEmail("pavi12@gmail.com");
		user.setPassword("Pavi12345");
		User users = new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getPassword());
		userService.saveUser(users);

	}

	@Test
	void deleteUserFail() {
		userService.delateUser(9);
	}

	@Test
	void deleteUser() {
		userService.delateUser(7);
	}

	@Test
	void verifyLogIn() {
		LoginDto logInDto = new LoginDto();
		logInDto.setEmail("ravi12@gmail.com");
		logInDto.setPassword("Ravi12345");
		userService.verifylogin(logInDto);

	}

	@Test
	void verifyLogInWrongPassword() {
		LoginDto logInDto = new LoginDto();
		logInDto.setEmail("ravi12@gmail.com");
		logInDto.setPassword("Ravi45");
		userService.verifylogin(logInDto);

	}

	@Test
	void verifyLogInWrongUser() {
		LoginDto logInDto = new LoginDto();
		logInDto.setEmail("ravi@gmail.com");
		logInDto.setPassword("Ravi45");
		userService.verifylogin(logInDto);

	}

	@Test
	void updatePassword() {
		UpdatePasswordDto uDto = new UpdatePasswordDto();
		uDto.setOldPassword("Ravi12345");
		uDto.setNewPassword("Ravi12");
		uDto.setConfirmNewPassword("Ravi12");
		userService.updateUserPassword(uDto, 6);

	}

	@Test
	void updatePasswordWithWrongPassword() {
		UpdatePasswordDto uDto = new UpdatePasswordDto();
		uDto.setOldPassword("Ravi12345");
		uDto.setNewPassword("Ravi12");
		uDto.setConfirmNewPassword("Ravi12");
		userService.updateUserPassword(uDto, 6);

	}

	@Test
	void updatePasswordWithsamePassword() {
		UpdatePasswordDto uDto = new UpdatePasswordDto();
		uDto.setOldPassword("Ravi12");
		uDto.setNewPassword("Ravi12");
		uDto.setConfirmNewPassword("Ravi12");
		userService.updateUserPassword(uDto, 6);

	}

	@Test
	void getUserById() {
		userService.getUserById(6);
	}

	@Test
	void saveWatchProduct() {
		Watches watch = new Watches();
		watch.setWatchId(104);
		watch.setBrandName("sonata");
		watch.setWatchType("analog");
		watch.setBandType("leather");
		watch.setWaterResistant("Yes");
		watch.setPrice(2000);
		productsService.saveWatches(watch);

	}

	@Test
	void saveWatchProductUsingDto() {
		WatchDto watch = new WatchDto();
		watch.setWatchId(105);
		watch.setBrandName("poomex");
		watch.setWatchType("analog");
		watch.setBandType("leather");
		watch.setWaterResistant("No");
		watch.setPrice(1000);
		Watches watches = new Watches(watch.getWatchId(), watch.getBrandName(), watch.getWatchType(),
				watch.getBandType(), watch.getWaterResistant(), watch.getPrice());
		productsService.saveWatches(watches);

	}

	@Test
	void saveWatchProductFail() {
		Watches watch = new Watches();
		watch.setWatchId(104);
		watch.setBrandName("gts");
		watch.setWatchType("analog");
		watch.setBandType("leather");
		watch.setWaterResistant("Yes");
		watch.setPrice(1200);
		productsService.saveWatches(watch);

	}

	@Test
	void getWatches() {
		productsService.getAllWatches();
	}

	@Test
	void updateWatche() {
		WatchesDto watchDto = new WatchesDto();
		watchDto.setBrandName("Sonata X pro");
		watchDto.setWatchType("Analog");
		watchDto.setBandType("Leather");
		watchDto.setWaterResistant("Yes");
		watchDto.setPrice(2500);
		productsService.updateWatch(watchDto, 104);
	}

	@Test
	void saveLaptopProduct() {
		Laptops laptop = new Laptops();
		laptop.setLaptopId(1004);
		laptop.setBrandName("Asus");
		laptop.setOs("Windows");
		laptop.setProcessor("i5 10th generation");
		laptop.setRam("16 gb");
		laptop.setDisplaySize("13 inches");
		laptop.setTouchScreen("No");
		laptop.setPrice(60000);
		productsService.saveLaptops(laptop);

	}

	@Test
	void saveLaptopProductUsingDto() {
		LaptopDto laptopDto = new LaptopDto();
		laptopDto.setLaptopId(1005);
		laptopDto.setBrandName("msi");
		laptopDto.setOs("Windows");
		laptopDto.setProcessor("i5 10th generation");
		laptopDto.setRam("16 gb");
		laptopDto.setDisplaySize("13 inches");
		laptopDto.setTouchScreen("No");
		laptopDto.setPrice(70000);
		Laptops laptop = new Laptops(laptopDto.getLaptopId(), laptopDto.getBrandName(), laptopDto.getOs(),
				laptopDto.getProcessor(), laptopDto.getRam(), laptopDto.getDisplaySize(), laptopDto.getTouchScreen(),
				laptopDto.getPrice());
		productsService.saveLaptops(laptop);

	}

	@Test
	void getLaptops() {
		productsService.getAllLaptops();
	}

	@Test
	void updateLaptop() {
		LaptopsDto laptopDto = new LaptopsDto();
		laptopDto.setBrandName("Asus");
		laptopDto.setOs("Windows");
		laptopDto.setProcessor("i5 11th generation");
		laptopDto.setRam("16 gb");
		laptopDto.setDisplaySize("13 inches");
		laptopDto.setTouchScreen("No");
		laptopDto.setPrice(65000);
		productsService.updateLaptops(laptopDto, 1004);
	}

	@Test
	void saveTvProduct() {
		Tvs tv = new Tvs();
		tv.setTvId(10004);
		tv.setBrandName("One plus");
		tv.setType("Andriod");
		tv.setDisplaySize("32 inches");
		tv.setDisplayType("Led");
		tv.setPrice(25000);
		productsService.saveTvs(tv);

	}

	@Test
	void saveTvProductFail() {
		Tvs tv = new Tvs();
		tv.setTvId(10004);
		tv.setBrandName("One plus");
		tv.setType("Andriod");
		tv.setDisplaySize("32 inches");
		tv.setDisplayType("Led");
		tv.setPrice(25000);
		productsService.saveTvs(tv);

	}

	@Test
	void saveTvProductUsingDto() {
		TvsDto tvDto = new TvsDto();
		tvDto.setTvId(10005);
		tvDto.setBrandName("samsung xpro");
		tvDto.setType("Andriod");
		tvDto.setDisplaySize("72 inches");
		tvDto.setDisplayType("Led");
		tvDto.setPrice(75000);
		Tvs tvs = new Tvs(tvDto.getTvId(), tvDto.getBrandName(), tvDto.getType(), tvDto.getDisplayType(),
				tvDto.getDisplaySize(), tvDto.getPrice());

		productsService.saveTvs(tvs);

	}

	@Test
	void getTvs() {
		productsService.getAllTvs();
	}

	@Test
	void updateTvDetails() {
		TvDto tvDto = new TvDto();
		tvDto.setBrandName("One plus");
		tvDto.setType("Android");
		tvDto.setDisplayType("Lcd");
		tvDto.setDisplaySize("32 inches");
		tvDto.setPrice(22000);
		productsService.updateTvs(tvDto, 10004);
	}

	@Test
	void updateTvDetailsFail() {
		TvDto tvDto = new TvDto();
		tvDto.setBrandName("One plus pro");
		tvDto.setType("Android");
		tvDto.setDisplayType("Lcd");
		tvDto.setDisplaySize("52 inches");
		tvDto.setPrice(32000);
		productsService.updateTvs(tvDto, 1119);
	}

	@Test
	void deleteTv() {
		productsService.delateTvs(10004);
	}

	@Test
	void deleteTvFail() {
		productsService.delateTvs(100004);
	}

	@Test
	void deleteLaptop() {
		productsService.delateLaptops(1004);
	}

	@Test
	void deleteLaptopFail() {
		productsService.delateLaptops(1009);
	}

	@Test
	void deleteWatch() {
		productsService.delateWatch(105);
	}

	@Test
	void deleteWatchFail() {
		productsService.delateWatch(111);
	}

}
