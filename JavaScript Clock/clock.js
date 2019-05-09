function clockUpdate() {
	setInterval(() => {
		const date = new Date();
		const time = date.toLocaleTimeString(window.navigator.language, { hour12: false });
		const clock = document.getElementById("clock");
		if (clock) {
			clock.textContent = time;
		}
	}, 1000);
}