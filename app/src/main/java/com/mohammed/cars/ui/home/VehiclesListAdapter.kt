//package com.mohammed.cars.ui.home
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import com.mohammed.cars.databinding.ItemVehichleBinding
//import com.mohammed.cars.domain.DevByteVehicles
//import com.mohammed.cars.network.models.Vehicle
//
//class VehiclesListAdapter(val clickListener: VehicleListener) :
//    ListAdapter<DevByteVehicles, VehiclesListAdapter.HomeViewHolder>(DiffCallback) {
//
//    class HomeViewHolder(
//        var binding: ItemVehichleBinding
//    ) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(clickListener: VehicleListener, DevByteVehicles: DevByteVehicles) {
////            binding.vehicle= DevByteVehicles
////            binding.imageView
////            binding.clickListener = clickListener
//            binding.executePendingBindings()
//
//        }
//    }
//
//    companion object DiffCallback : DiffUtil.ItemCallback<DevByteVehicles>() {
//
//        override fun areItemsTheSame(oldItem: DevByteVehicles, newItem: DevByteVehicles): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: DevByteVehicles, newItem: DevByteVehicles): Boolean {
//            return oldItem.imgSrcUrl == newItem.imgSrcUrl
//        }
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return HomeViewHolder(
//            ItemVehichleBinding.inflate(layoutInflater, parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
//        val vehicle = getItem(position)
//        holder.bind(clickListener, vehicle)
//
//    }
//}
//class VehicleListener (val clickListener: (DevByteVehicles: DevByteVehicles) -> Unit){
//        fun onClick(DevByteVehicles: DevByteVehicles) = clickListener(DevByteVehicles)
//}