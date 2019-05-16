const main = {
	init() {
		const formAdd = document.getElementById('formAdd');
		formAdd.onsubmit = this.onSubmitForm.bind(this);

		const list = document.querySelector('#list > tbody');
		list.onlick = this.onClickList.bind(this);

		const contacts = this.read();
		if (!contacts) {
			this.write([]);
		}
	},

	onSubmitForm(event) {
		event.preventDefault();
		const elements = event.target.elements;
		const name = elements.name.value;
		const email = elements.email.value;
		const phone = elements.phone.value;
		this.save({ name, email, phone });
	},

	onClickList(event) {

	},

	save(data) {
		const contacts = this.read();
		const contact = Object.assign({ id: contacts.length }, data);
		contacts.push(contact);
		this.write(contacts);
	},

	read() {
		return JSON.parse(localStorage.getItem('contacts'));
	},

	write(data) {
		localStorage.setItem('contacts', JSON.stringify(data));
	},
};
