/* globals Chart:false */

(() => {
	'use strict'

	// Get all nav items with submenus
	const navItems = document.querySelectorAll('.nav-item');

	// Add event listener to each nav item
	navItems.forEach((item) => {
		const submenu = item.querySelector('.submenu');
		if (submenu) {
			item.addEventListener('click', () => {
				// Toggle submenu visibility
				submenu.classList.toggle('show');
			});
		}
	});

	// Graphs
	const ctx = document.getElementById('myChart')
	// eslint-disable-next-line no-unused-vars
	const myChart = new Chart(ctx, {
		type: 'line',
		data: {
			labels: [
				'Sunday',
				'Monday',
				'Tuesday',
				'Wednesday',
				'Thursday',
				'Friday',
				'Saturday'
			],
			datasets: [{
				data: [
					15339,
					21345,
					18483,
					24003,
					23489,
					24092,
					12034
				],
				lineTension: 0,
				backgroundColor: 'transparent',
				borderColor: '#007bff',
				borderWidth: 4,
				pointBackgroundColor: '#007bff'
			}]
		},
		options: {
			plugins: {
				legend: {
					display: false
				},
				tooltip: {
					boxPadding: 3
				}
			}
		}
	})

	const submenuLinks = document.querySelectorAll('.submenu .nav-link');

	submenuLinks.forEach((link) => {
		link.addEventListener('click', (e) => {
			e.stopPropagation();
		});
	});

	const menuLinks = document.querySelectorAll('.nav-link');

	menuLinks.forEach((link) => {
		link.addEventListener('click', () => {
			const contenido = document.getElementById(link.getAttribute('data-contenido'));
			const contenidoAnterior = document.querySelector('.d-block');

			if (contenidoAnterior) {
				contenidoAnterior.classList.remove('d-block');
				contenidoAnterior.classList.add('d-none');
			}

			contenido.classList.remove('d-none');
			contenido.classList.add('d-block');
		});
	});
})();